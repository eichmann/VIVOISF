package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentValidInInverseIterator theContinentValidInInverseIterator = (ContinentValidInInverseIterator)findAncestorWithClass(this, ContinentValidInInverseIterator.class);
			pageContext.getOut().print(theContinentValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for validIn tag ");
		}
		return SKIP_BODY;
	}
}

