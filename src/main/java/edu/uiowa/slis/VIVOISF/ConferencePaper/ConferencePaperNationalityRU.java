package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityRUIterator theConferencePaper = (ConferencePaperNationalityRUIterator)findAncestorWithClass(this, ConferencePaperNationalityRUIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

