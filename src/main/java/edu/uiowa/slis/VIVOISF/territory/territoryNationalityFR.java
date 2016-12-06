package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityFRIterator theterritory = (territoryNationalityFRIterator)findAncestorWithClass(this, territoryNationalityFRIterator.class);
			pageContext.getOut().print(theterritory.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

