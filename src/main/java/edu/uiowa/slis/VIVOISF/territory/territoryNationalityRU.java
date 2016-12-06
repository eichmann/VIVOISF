package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityRUIterator theterritory = (territoryNationalityRUIterator)findAncestorWithClass(this, territoryNationalityRUIterator.class);
			pageContext.getOut().print(theterritory.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

