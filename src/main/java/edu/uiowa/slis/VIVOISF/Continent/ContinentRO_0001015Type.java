package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRO_0001015Iterator theContinentRO_0001015Iterator = (ContinentRO_0001015Iterator)findAncestorWithClass(this, ContinentRO_0001015Iterator.class);
			pageContext.getOut().print(theContinentRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

