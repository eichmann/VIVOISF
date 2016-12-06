package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCountryAreaUnitIterator theCollection = (CollectionCountryAreaUnitIterator)findAncestorWithClass(this, CollectionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theCollection.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

