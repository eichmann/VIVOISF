package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityARIterator theterritory = (territoryNationalityARIterator)findAncestorWithClass(this, territoryNationalityARIterator.class);
			pageContext.getOut().print(theterritory.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

