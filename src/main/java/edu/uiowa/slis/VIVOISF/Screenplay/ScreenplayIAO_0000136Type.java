package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayIAO_0000136Iterator theScreenplayIAO_0000136Iterator = (ScreenplayIAO_0000136Iterator)findAncestorWithClass(this, ScreenplayIAO_0000136Iterator.class);
			pageContext.getOut().print(theScreenplayIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

