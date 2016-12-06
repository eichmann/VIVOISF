package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeFAOSTATIterator theCollection = (CollectionCodeFAOSTATIterator)findAncestorWithClass(this, CollectionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theCollection.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

