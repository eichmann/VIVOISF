package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentDescriptionIterator theContinent = (ContinentDescriptionIterator)findAncestorWithClass(this, ContinentDescriptionIterator.class);
			pageContext.getOut().print(theContinent.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for description tag ");
		}
		return SKIP_BODY;
	}
}

