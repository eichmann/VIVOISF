package edu.uiowa.slis.VIVOISF.Certification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificationRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificationRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificationRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificationRO_0000052Iterator theCertificationRO_0000052Iterator = (CertificationRO_0000052Iterator)findAncestorWithClass(this, CertificationRO_0000052Iterator.class);
			pageContext.getOut().print(theCertificationRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing Certification for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

