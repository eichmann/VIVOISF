package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNationalityARIterator theConferencePoster = (ConferencePosterNationalityARIterator)findAncestorWithClass(this, ConferencePosterNationalityARIterator.class);
			pageContext.getOut().print(theConferencePoster.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

