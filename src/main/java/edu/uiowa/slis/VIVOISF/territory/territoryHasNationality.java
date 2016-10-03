package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasNationality extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasNationality currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasNationality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasNationalityIterator theterritory = (territoryHasNationalityIterator)findAncestorWithClass(this, territoryHasNationalityIterator.class);
			pageContext.getOut().print(theterritory.getHasNationality());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasNationality tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasNationality tag ");
		}
		return SKIP_BODY;
	}
}

