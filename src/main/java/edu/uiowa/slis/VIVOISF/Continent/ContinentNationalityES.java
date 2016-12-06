package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityESIterator theContinent = (ContinentNationalityESIterator)findAncestorWithClass(this, ContinentNationalityESIterator.class);
			pageContext.getOut().print(theContinent.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

