package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayIsbn10Iterator theScreenplay = (ScreenplayIsbn10Iterator)findAncestorWithClass(this, ScreenplayIsbn10Iterator.class);
			pageContext.getOut().print(theScreenplay.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

