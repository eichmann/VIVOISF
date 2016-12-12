package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityZHIterator theTerritory = (TerritoryNationalityZHIterator)findAncestorWithClass(this, TerritoryNationalityZHIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

