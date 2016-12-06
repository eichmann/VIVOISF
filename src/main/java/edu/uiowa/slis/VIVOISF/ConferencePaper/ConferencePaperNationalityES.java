package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityESIterator theConferencePaper = (ConferencePaperNationalityESIterator)findAncestorWithClass(this, ConferencePaperNationalityESIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

