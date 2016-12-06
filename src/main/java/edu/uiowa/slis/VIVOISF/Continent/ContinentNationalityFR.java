package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityFRIterator theContinent = (ContinentNationalityFRIterator)findAncestorWithClass(this, ContinentNationalityFRIterator.class);
			pageContext.getOut().print(theContinent.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

