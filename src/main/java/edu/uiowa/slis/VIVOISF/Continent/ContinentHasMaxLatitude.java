package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHasMaxLatitudeIterator theContinent = (ContinentHasMaxLatitudeIterator)findAncestorWithClass(this, ContinentHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theContinent.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

