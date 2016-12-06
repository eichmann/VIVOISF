package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityITIterator theConferencePaper = (ConferencePaperNationalityITIterator)findAncestorWithClass(this, ConferencePaperNationalityITIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

