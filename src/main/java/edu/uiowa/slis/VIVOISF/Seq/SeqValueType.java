package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqValueIterator theSeqValueIterator = (SeqValueIterator)findAncestorWithClass(this, SeqValueIterator.class);
			pageContext.getOut().print(theSeqValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for value tag ");
		}
		return SKIP_BODY;
	}
}

