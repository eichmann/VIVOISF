package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRelatesIterator theContinentRelatesIterator = (ContinentRelatesIterator)findAncestorWithClass(this, ContinentRelatesIterator.class);
			pageContext.getOut().print(theContinentRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for relates tag ");
		}
		return SKIP_BODY;
	}
}

