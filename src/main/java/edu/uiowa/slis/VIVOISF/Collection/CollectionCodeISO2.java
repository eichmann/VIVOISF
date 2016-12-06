package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeISO2Iterator theCollection = (CollectionCodeISO2Iterator)findAncestorWithClass(this, CollectionCodeISO2Iterator.class);
			pageContext.getOut().print(theCollection.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

