package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityITIterator theterritory = (territoryNationalityITIterator)findAncestorWithClass(this, territoryNationalityITIterator.class);
			pageContext.getOut().print(theterritory.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

