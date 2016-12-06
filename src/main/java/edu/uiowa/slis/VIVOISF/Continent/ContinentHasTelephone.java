package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasTelephoneIterator theContinentHasTelephoneIterator = (ContinentHasTelephoneIterator)findAncestorWithClass(this, ContinentHasTelephoneIterator.class);
			pageContext.getOut().print(theContinentHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

