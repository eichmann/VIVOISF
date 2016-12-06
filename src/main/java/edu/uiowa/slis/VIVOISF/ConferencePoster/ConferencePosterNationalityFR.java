package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNationalityFRIterator theConferencePoster = (ConferencePosterNationalityFRIterator)findAncestorWithClass(this, ConferencePosterNationalityFRIterator.class);
			pageContext.getOut().print(theConferencePoster.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}
