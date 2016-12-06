package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityZHIterator theContinent = (ContinentNationalityZHIterator)findAncestorWithClass(this, ContinentNationalityZHIterator.class);
			pageContext.getOut().print(theContinent.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

