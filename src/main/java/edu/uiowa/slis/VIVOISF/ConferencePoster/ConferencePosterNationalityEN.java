package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNationalityENIterator theConferencePoster = (ConferencePosterNationalityENIterator)findAncestorWithClass(this, ConferencePosterNationalityENIterator.class);
			pageContext.getOut().print(theConferencePoster.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

