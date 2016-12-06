package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityESIterator theterritory = (territoryNationalityESIterator)findAncestorWithClass(this, territoryNationalityESIterator.class);
			pageContext.getOut().print(theterritory.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

