package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasTelephoneIterator theARG_2000379HasTelephoneIterator = (ARG_2000379HasTelephoneIterator)findAncestorWithClass(this, ARG_2000379HasTelephoneIterator.class);
			pageContext.getOut().print(theARG_2000379HasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

