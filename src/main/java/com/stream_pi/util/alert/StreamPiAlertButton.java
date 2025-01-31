package com.stream_pi.util.alert;

import com.stream_pi.util.i18n.I18N;
import javafx.scene.control.Button;
import org.kordamp.ikonli.javafx.FontIcon;

public class StreamPiAlertButton
{
    private final String i18nString;
    private final String fontIconCode;

    public StreamPiAlertButton(String i18nString)
    {
        this(i18nString, null);
    }

    public StreamPiAlertButton(String i18nString, String fontIconCode)
    {
        this.i18nString = i18nString;
        this.fontIconCode = fontIconCode;
    }

    public Button getButton()
    {
        Button button = new Button(I18N.getString(i18nString));

        if(fontIconCode != null)
        {
            button.setGraphic(new FontIcon(fontIconCode));
        }

        return button;
    }

    public static final StreamPiAlertButton YES = new StreamPiAlertButton("alert.StreamPiAlertButtonDefaults.yes");
    public static final StreamPiAlertButton NO = new StreamPiAlertButton("alert.StreamPiAlertButtonDefaults.no");
    public static final StreamPiAlertButton OK = new StreamPiAlertButton("alert.StreamPiAlertButtonDefaults.ok");
    public static final StreamPiAlertButton CANCEL = new StreamPiAlertButton("alert.StreamPiAlertButtonDefaults.cancel");
}
