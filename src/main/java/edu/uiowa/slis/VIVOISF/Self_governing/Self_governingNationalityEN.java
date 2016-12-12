package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityENIterator theSelf_governing = (Self_governingNationalityENIterator)findAncestorWithClass(this, Self_governingNationalityENIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

