package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityARIterator theConferencePaper = (ConferencePaperNationalityARIterator)findAncestorWithClass(this, ConferencePaperNationalityARIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

