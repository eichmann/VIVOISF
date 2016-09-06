package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityENIterator theself_governing = (self_governingNationalityENIterator)findAncestorWithClass(this, self_governingNationalityENIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

