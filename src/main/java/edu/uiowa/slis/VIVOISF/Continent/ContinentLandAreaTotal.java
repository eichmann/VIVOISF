package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentLandAreaTotalIterator theContinent = (ContinentLandAreaTotalIterator)findAncestorWithClass(this, ContinentLandAreaTotalIterator.class);
			pageContext.getOut().print(theContinent.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

