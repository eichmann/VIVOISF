package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityENIterator theterritory = (territoryNationalityENIterator)findAncestorWithClass(this, territoryNationalityENIterator.class);
			pageContext.getOut().print(theterritory.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

