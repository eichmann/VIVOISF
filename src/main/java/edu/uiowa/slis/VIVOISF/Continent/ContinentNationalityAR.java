package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityARIterator theContinent = (ContinentNationalityARIterator)findAncestorWithClass(this, ContinentNationalityARIterator.class);
			pageContext.getOut().print(theContinent.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

