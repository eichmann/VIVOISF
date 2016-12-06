package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasTelephoneIterator theContinentHasTelephoneIterator = (ContinentHasTelephoneIterator)findAncestorWithClass(this, ContinentHasTelephoneIterator.class);
			pageContext.getOut().print(theContinentHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
