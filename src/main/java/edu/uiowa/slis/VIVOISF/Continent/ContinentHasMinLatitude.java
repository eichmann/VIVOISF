package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHasMinLatitudeIterator theContinent = (ContinentHasMinLatitudeIterator)findAncestorWithClass(this, ContinentHasMinLatitudeIterator.class);
			pageContext.getOut().print(theContinent.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

