package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCountryAreaYearIterator theCollection = (CollectionCountryAreaYearIterator)findAncestorWithClass(this, CollectionCountryAreaYearIterator.class);
			pageContext.getOut().print(theCollection.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

