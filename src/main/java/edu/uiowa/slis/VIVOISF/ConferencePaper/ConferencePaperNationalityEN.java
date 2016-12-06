package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityENIterator theConferencePaper = (ConferencePaperNationalityENIterator)findAncestorWithClass(this, ConferencePaperNationalityENIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

