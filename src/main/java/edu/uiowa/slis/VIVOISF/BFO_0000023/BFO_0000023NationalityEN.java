package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023NationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023NationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023NationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023NationalityENIterator theBFO_0000023 = (BFO_0000023NationalityENIterator)findAncestorWithClass(this, BFO_0000023NationalityENIterator.class);
			pageContext.getOut().print(theBFO_0000023.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

