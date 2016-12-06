package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasEmailIterator theContinentHasEmailIterator = (ContinentHasEmailIterator)findAncestorWithClass(this, ContinentHasEmailIterator.class);
			pageContext.getOut().print(theContinentHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

