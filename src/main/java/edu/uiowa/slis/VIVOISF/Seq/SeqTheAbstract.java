package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeqTheAbstractIterator theSeq = (SeqTheAbstractIterator)findAncestorWithClass(this, SeqTheAbstractIterator.class);
			pageContext.getOut().print(theSeq.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

