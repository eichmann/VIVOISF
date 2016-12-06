package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCountryAreaTotalIterator theCollection = (CollectionCountryAreaTotalIterator)findAncestorWithClass(this, CollectionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theCollection.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

