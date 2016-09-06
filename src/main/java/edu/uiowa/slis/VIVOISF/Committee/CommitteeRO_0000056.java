package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeRO_0000056Iterator theCommitteeRO_0000056Iterator = (CommitteeRO_0000056Iterator)findAncestorWithClass(this, CommitteeRO_0000056Iterator.class);
			pageContext.getOut().print(theCommitteeRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

