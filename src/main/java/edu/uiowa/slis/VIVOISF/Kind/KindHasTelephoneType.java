package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasTelephoneIterator theKindHasTelephoneIterator = (KindHasTelephoneIterator)findAncestorWithClass(this, KindHasTelephoneIterator.class);
			pageContext.getOut().print(theKindHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

