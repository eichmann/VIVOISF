package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityITIterator theContinent = (ContinentNationalityITIterator)findAncestorWithClass(this, ContinentNationalityITIterator.class);
			pageContext.getOut().print(theContinent.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

