package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityFRIterator theConferencePaper = (ConferencePaperNationalityFRIterator)findAncestorWithClass(this, ConferencePaperNationalityFRIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

