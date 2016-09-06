package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentDateFiled extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentDateFiled currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentDateFiled.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentDateFiledIterator thePatentDateFiledIterator = (PatentDateFiledIterator)findAncestorWithClass(this, PatentDateFiledIterator.class);
			pageContext.getOut().print(thePatentDateFiledIterator.getDateFiled());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for dateFiled tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for dateFiled tag ");
		}
		return SKIP_BODY;
	}
}

