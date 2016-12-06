package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasURLIterator theContinentHasURLIterator = (ContinentHasURLIterator)findAncestorWithClass(this, ContinentHasURLIterator.class);
			pageContext.getOut().print(theContinentHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

